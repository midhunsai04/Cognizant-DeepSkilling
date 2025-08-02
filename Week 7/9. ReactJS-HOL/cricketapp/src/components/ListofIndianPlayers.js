import React from 'react';

function ListofIndianPlayers({ IndianPlayers }) {
    return (
        <ul>
            {
                IndianPlayers.map((player) => {
                    return (
                        <>
                            <li>Mr. {player}</li>
                        </>
                    );
                })
            }
        </ul>
    );
}

export default ListofIndianPlayers;
