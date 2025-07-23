import React, { useState } from 'react';

function App() {
  const [roomWidth, setRoomWidth] = useState('');
  const [roomLength, setRoomLength] = useState('');
  const [furnWidth, setFurnWidth] = useState('');
  const [furnLength, setFurnLength] = useState('');
  const [fits, setFits] = useState(null);

  const checkFit = async () => {
    const params = new URLSearchParams({
      roomWidth,
      roomLength,
      furnitureWidth: furnWidth,
      furnitureLength: furnLength,
    });
    const res = await fetch(`/api/rooms/fit?${params}`);
    const data = await res.json();
    setFits(data);
  };

  return (
    <div style={{ padding: '1rem' }}>
      <h1>Room Design Challenge</h1>
      <div>
        <label>
          Room Width: <input value={roomWidth} onChange={e => setRoomWidth(e.target.value)} />
        </label>
      </div>
      <div>
        <label>
          Room Length: <input value={roomLength} onChange={e => setRoomLength(e.target.value)} />
        </label>
      </div>
      <div>
        <label>
          Furniture Width: <input value={furnWidth} onChange={e => setFurnWidth(e.target.value)} />
        </label>
      </div>
      <div>
        <label>
          Furniture Length: <input value={furnLength} onChange={e => setFurnLength(e.target.value)} />
        </label>
      </div>
      <button onClick={checkFit}>Check Fit</button>
      {fits !== null && (
        <p>{fits ? 'It fits 🎉' : 'Does not fit 😢'}</p>
      )}
    </div>
  );
}

export default App;
