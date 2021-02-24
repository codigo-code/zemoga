import axios from "axios";

// export default {
 
//   consumeProfile() {
//     try {
//       return axios.get("http://localhost:8980/getAllPortfolios");
//     } catch (error) {
//       console.error(error);
//     }
//   }
// }

export default {
  getProfileById(id){
    try {
      return axios.get("http://localhost:8980/getAllPortfolios/"+id);
    } catch (error) {
      console.error(error);
    }
  }
}

