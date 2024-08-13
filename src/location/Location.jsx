import React, { useState } from 'react';
import MapComponent from '../components/MapComponent';

function Location() {
  const [location, setLocation] = useState({ lat: null, lon: null });
  const [error, setError] = useState(null);

  const getLocation = () => {
    if (navigator.geolocation) {

      console.log(navigator.geolocation.getCurrentPosition)
      console.log(navigator.geolocation.watchPosition)

      navigator.geolocation.getCurrentPosition(
        (position) => {
          setLocation({
            lat: position.coords.latitude,
            lon: position.coords.longitude,
          });
          setError(null);
        },
        (err) => {
          setError(err.message);
        }
      );
    } else {
      setError('La géolocalisation n\'est pas supportée par ce navigateur.');
    }
  };

  return (
    <div>
      <button onClick={getLocation}>Obtenir la localisation</button>
      {location.lat && location.lon && (
        <div>
          <p>Latitude: {location.lat}</p>
          <p>Longitude: {location.lon}</p>
          <MapComponent lat={location.lat} lon={location.lon} />
        </div>
      )}
      {error && <p>Erreur: {error}</p>}
    </div>
  );
}

export default Location;
