import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Counter from './Counter/Counter';
import CityPage from './CityPage/CityPage';
import Sandwich from './Sandwich/Sandwich';
import CarShop from './CarShop/CarShop';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <App />
    <Counter />
    <CityPage />
    <Sandwich />
    <CarShop />
  </React.StrictMode>
);
