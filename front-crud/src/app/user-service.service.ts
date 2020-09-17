import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http : HttpClient) { }

  public doRegistration(user){
    return this.http.post("http://localhost:9090/save", user , { responseType :"text" as "json"});
  }

  public getUsers(){
    return this.http.get("http://localhost:9090/showAllUsers");
  }

  public getUserByUsername(username){
    return this.http.get("http://localhost:9090/search/"+username);
  }
  public deleteUser(username){
    return this.http.get("http://localhost:9090/delete/"+username);
  }
}
