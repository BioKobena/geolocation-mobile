import React from 'react';
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import { Icon } from 'leaflet';

const myIcon = new Icon({
    iconUrl: "https://cdn4.iconfinder.com/data/icons/essentials-72/24/025_-_Location-512.png",
    iconSize: [25, 41],
    iconAnchor: [12, 41],
});

function MapComponent({ lat, lon, accuracy }) {
    return (
        <MapContainer center={[lat, lon, accuracy]} zoom={13} style={{ height: "400px", width: "100%" }}>
            <TileLayer
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
            />
            <Marker position={[lat, lon, accuracy]} icon={myIcon}>
                <Popup>
                    Vous êtes ici !
                </Popup>
            </Marker>
        </MapContainer>
    );
}

export default MapComponent;
