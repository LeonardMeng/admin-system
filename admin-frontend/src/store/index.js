import { createStore, applyMiddleware } from 'redux'
import reduxThunk from 'redux-thunk'
// import reducer from './reducers'

const store = createStore({
    state: {

    },
    getters: {
        GET_TOKEN: state => {
            return sessionStorage.getItem('token')
        }
    },
    mutations: {
        SET_TOKEN: (state, token) => {
            sessionStorage.setItem('token', token)
        }
    },
    actions: {

    },
    modules: {

    }
});

export default store
