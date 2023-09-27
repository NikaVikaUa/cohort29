interface Name {
  firstname:string,
  lastname:string
}

export default interface User {
  id:number,
  email:string,
  username:string,
  password:string,
  name:Name
}
