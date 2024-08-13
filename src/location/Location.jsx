import React, { useState } from 'react';
import MapComponent from '../components/MapComponent';

function Location() {
  const [location, setLocation] = useState({ lat: null, lon: null, accuracy: null });
  const [error, setError] = useState(null);

  const getLocation = () => {
    if (navigator.geolocation) {

      console.log(navigator.geolocation.getCurrentPosition)
      console.log(navigator.geolocation.watchPosition)

      navigator.geolocation.getCurrentPosition(
        (position) => {
          console.log(position)
          setLocation({
            lat: position.coords.latitude,
            lon: position.coords.longitude,
            accuracy: position.coords.accuracy
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
          <p>Accuracy: {location.accuracy}</p>
          <MapComponent lat={location.lat} lon={location.lon} accuracy={location.accuracy} />
        </div>
      )}
      {error && <p>Erreur: {error}</p>}
    </div>
  );
}

export default Location;
