import React, { useEffect, useState } from 'react';

export default function Room() {
  const [furniture, setFurniture] = useState([]);

  useEffect(() => {
    fetch('/api/rooms/furniture')
      .then(res => res.json())
      .then(data => setFurniture(data))
      .catch(err => console.error('API fetch error:', err));
  }, []);

  const roomImages = [
    '/static/rooms/room-1.png',
    '/static/rooms/room-2.png',
    '/static/rooms/room-3.png'
  ];

  return (
    <div style={{ padding: 20 }}>
    <h1 style={{ textAlign: "center" }}>Room Design Challenge</h1>
      <div style={{ marginBottom: 30 }}>
        <h3>Rooms</h3>
        <div style={{
          display: 'flex',
          gap: '20px',
          justifyContent: 'left',
          marginTop: '10px'
        }}>
          {roomImages.map((src, idx) => (
            <div key={idx} style={{
              border: '1px solid #ccc',
              borderRadius: '8px',
              padding: '10px',
              background: '#fff',
              width: 200
            }}>
              <img
                src={src}
                alt={`Room ${idx + 1}`}
                style={{ width: '100%', borderRadius: '4px' }}
              />
              <div style={{ marginTop: 8, textAlign: 'center' }}>{`Room ${idx + 1}`}</div>
            </div>
          ))}
        </div>
      </div>

      <h3>Furniture</h3>
      <div style={{
        display: 'flex',
        justifyContent: 'left',
        flexWrap: 'wrap',
        gap: '20px',
        border: '1px dashed #999',
        padding: '20px',
        background: '#f9f9f9'
      }}>
        {furniture.length > 0 ? furniture.map(item => (
          <div key={item.id} style={{
            width: 120,
            textAlign: 'center',
            border: '1px solid #ccc',
            borderRadius: '8px',
            padding: '10px',
            background: '#fff'
          }}>
            <img
              src={item.imageUrl}
              alt={item.name}
              style={{ width: '100%', borderRadius: '4px' }}
            />
            <div style={{ marginTop: 8, fontSize: 14 }}>{item.name}</div>
          </div>
        )) : (
          <p>Loading furniture...</p>
        )}
      </div>
    </div>
  );
}
