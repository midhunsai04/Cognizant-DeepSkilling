import React from 'react';

function ListOfPlayers({ players }) {
  return (
    <ul>
      {players.map((item) => (
        <li>Mr. {item.name} <span>{item.score}</span></li>
      ))}
    </ul>
  );
}

export default ListOfPlayers;
