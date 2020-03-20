import axios from 'axios'

const AXIOS = axios.create({
    baseURL: `http://localhost:8081/api`,
    timeout: 1000
});

export default {
    checkTest() {
        return AXIOS.get('/test');
    }
}