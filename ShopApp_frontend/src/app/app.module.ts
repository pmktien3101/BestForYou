import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';


@NgModule({
  declarations: [
  
    HomeComponent,
       HeaderComponent,
       FooterComponent,
       LoginComponent,
       RegisterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap:[
    // LoginComponent,
    RegisterComponent
  ]
})
export class AppModule { }
