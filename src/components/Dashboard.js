import React from 'react'
import { useState, useEffect } from 'react'
import axios from 'axios';
import { Bar } from 'react-chartjs-2';
import Chart from './Chart'
import Filter from './Filter'
import './index.css';

const Dashboard = () => {
  const [data, setData] = useState([]);

  useEffect(() => {

    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await axios.get('http://localhost:8080/api/dashboard/alldata');
      setData(response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  

  return (
    <div className="dashboard-container">
      <h1>Data Visualization Dashboard</h1>
      <table className="data-table">
        <thead>
          <tr>
            <th>Intensity</th>
            <th>Likelihood</th>
            <th>Relevance</th>
            <th>Country</th>
            <th>Topics</th>
            <th>Region</th>
            <th>StartYear</th>
            <th>EndYear</th>
          </tr>
        </thead>
        <tbody>
          {data.map((item) => (

            <tr key={item.index}>
              <td>{item.intensity}</td>
              <td>{item.likelihood}</td>
              <td>{item.relevance}</td>
              <td>{item.country}</td>
              <td>{item.topics}</td>
              <td>{item.region}</td>
              <td>{item.startYear}</td>
              <td>{item.endYear}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default Dashboard
