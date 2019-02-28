export class User {

  public id: number = 0;
  public name: string;
  public age: number;
  public username: string;
  public password: string;

  constructor(id: number, name: string, age: number, username: string, password: string) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.username = username;
    this.password = password;
  }
}
