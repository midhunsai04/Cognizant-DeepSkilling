import logo from './logo.svg';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore Name={"Thirumurugan"}
        School={"MULLAI HR SEC SCHOOL"}
        total={493}
        goal={5}
      />
    </div>
  );
}

export default App;
