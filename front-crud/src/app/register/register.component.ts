import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { User } from '../user';
import { UrlResolver } from '@angular/compiler';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  message : any;
  user : User = new User("","","",0,0,"");

  constructor(private service : UserServiceService) { }

  ngOnInit(): void {
  }

  public registerNow(){
    let response = this.service.doRegistration(this.user);
    response.subscribe(data => this.message = data );
  }
}
