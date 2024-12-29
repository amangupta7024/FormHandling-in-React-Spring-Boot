import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import axios from 'axios';

function App() {


 const [formData, setFormData] = useState({
  firstName: "",
  lastName: "",
  email: "",
  contactNumber: "",
  address: "",
  city: "",
  state: "",
  country: "",
 });

 const handleChange = (e) => {
  const { name, value } = e.target;
  setFormData((prevFormData) => ({ ...prevFormData, [name]: value }));
 }


 const handleSubmit = async (e) => {
  e.preventDefault();
  console.log(formData);

  
   let apiUrl = 'http://localhost:8082/saveUserData';
  // API call to send data to server
  try{
    const response = await axios.post(apiUrl, formData);
    console.log(response);
  } catch(error) {
    console.log("error occurred while api calling " + error);
  }
 }

  return (
    <div className="App">
    <h2> From Handling</h2>

    <form onSubmit={handleSubmit}>
      <div>
        <label>First Name:</label>
        <input type="text"
         name="firstName"
         value={formData.firstName}
         onChange={handleChange}
        />
      
      </div>
<br/>
      <div>
        <label>Last Name:</label>
        <input type="text"
         name="lastName"
         value={formData.lastName}
         onChange={handleChange}
        />
        
      </div>

      <br/>

      <div>
        <label>Email:</label>
        <input type="email"
         name="email"
         value={formData.email}
         onChange={handleChange}
        />
       
      </div>

      <br/>

      <div>
        <label>Contact Number:</label>
        <input type="tel" name="contactNumber"
        value={formData.contactNumber}
        onChange={handleChange}
        />
        
        </div>
        <br/>

        <div>
        <label>address:</label>
        <input type="text" 
        name="address" 
        value={formData.address}
        onChange={handleChange}
        />
        
</div>

<br/>

<div>
        <label>city:</label>
        <input type="text" name="city" 
        value={formData.city}
        onChange={handleChange}
        />
        
        </div>

        <br/>
        <div>
        <label>State</label>
        <input type="text"
        name="state"
        value={formData.state}
        onChange={handleChange}
        />
        
        </div>

        <br/>


        <div>
        <label>country</label>
        <input type="text" 
        name="country"
        value={formData.country}
        onChange={handleChange}
          
        />

<br/><br/>
        <button type='submit'>Submit</button>
    
      </div>
    </form>

     
    </div>
  );
}

export default App;
