import {combineReducers, createStore} from 'redux';
import counterReducer from './features/counter/counterReducer';

const store = createStore(combineReducers({
  counter: counterReducer,
  // cars: carsReducer, // пример добавления новой фичи
}))

export default store;

export type RootState = ReturnType<typeof store.getState>
