import React, { useState } from 'react';

function CurrencyConvertor() {
    const [amount, setAmount] = useState('');
    const [currency, setCurrency] = useState('');

    const handleConvert = () => {
        if (currency.toLowerCase().trim() === 'euro') {
            const euroAmount = amount * 80;
            alert(`Converting to Euro Amount is ${euroAmount}`);
        } else {
            alert('Only Euro conversion is supported.');
        }
    };

    return (
        <div>
            <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>

            <div style={{ display: 'flex', alignItems: 'center', marginBottom: '10px' }}>
                <label style={{ width: '80px' }}> Amount: </label>
                <input type="text" value={amount} 
                onChange={(e) => setAmount(e.target.value)} 
                />
            </div>

            <div style={{ display: 'flex', alignItems: 'flex-start', marginBottom: '10px' }}>
                <label style={{ width: '80px' }}> Currency: </label>
                <textarea value={currency} 
                onChange={(e) => setCurrency(e.target.value)} 
                rows={2} cols={30}
                />
            </div>

            <button style={{marginLeft:'120px'}} onClick={handleConvert}>Submit</button>
        </div>
    );
}

export default CurrencyConvertor;
