import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchComponent } from './search/search.component';
import { AllUsersComponent } from './all-users/all-users.component';
import { RegisterComponent } from './register/register.component';
import { MohammaditworldComponent } from './mohammaditworld/mohammaditworld.component';
import { AboutComponent } from './about/about.component';
import { ContactusComponent } from './contactus/contactus.component';

const routes: Routes = [
  { path: "", redirectTo : "mohammaditworld" , pathMatch : "full" },
  { path: "search", component : SearchComponent },
  { path: "all-users", component : AllUsersComponent },
  { path: "register", component : RegisterComponent },
  { path: "mohammaditworld", component : MohammaditworldComponent },
  { path: "about", component : AboutComponent },
  { path: "contactus", component : ContactusComponent },
  { path : "**" , component : MohammaditworldComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
