import axios from 'axios'
const USERS_REST_API_URL = 'http://137.184.74.11:8080/api/v1/report';


class UserService {
    getUsers(){
        return axios.get(USERS_REST_API_URL);
    }
}

export default new UserService();