import logo from './logo.svg';
import './App.css';

function App() {

  const element = "Office Space";

  const OfficeList = [{ Name: "DBS", Rent: 50000, Address: "Chennai" },
  { Name: "CTS", Rent: 75000, Address: "Trichy" }]

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>

      {OfficeList.map((item, index) => {
        const image = item.Rent > 60000 ? '/Img2.jpg' : '/Img1.jpg';
        let colors = [];
        if (item.Rent <= 60000) {
          colors.push('textRed');
        } else {
          colors.push('textGreen');
        }

        return (
          <div key={index}>
            <img src={image} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {item.Name}</h1>
            <h2 className={colors}>Rent: Rs. {item.Rent}</h2>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
