import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import User from './types/User';

export default function Users():JSX.Element {
  const [users, setUsers] = useState<User[]>([]);
  async function loadUsers():Promise<void> {
    const res = await fetch('https://fakestoreapi.com/users');
    const arr: User[] = await res.json();
    setUsers(arr);
  }
  useEffect(() => {
    loadUsers();
  }, []);
  return (
    <div>
      <ul>
        {users.map((user) => (
        <li key={user.id}>
          <p>{user.username}</p>
          {/* <p>{user.email}</p>
          <p>{user.password}</p> */}
          <p>{user.name.firstname}</p>
          <p>{user.name.lastname}</p>
          <Link to={String(user.id)}>
            К странице пользователя
          </Link>
        </li>
        )
        )}
      </ul>
    </div>
  );
}
