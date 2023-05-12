import axios from "axios";

export default axios.create({
  baseURL: "http://192.168.212.66:9999/vue",
  headers: {
    "Content-type": "application/json",
  },
});
