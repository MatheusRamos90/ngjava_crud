/**
 * @Entries jQuery, Popper.js, Bootstrap, AngularJS, Angular Material, Angular Animate
 * */

//jQuery
require('jquery');

//Popper.js
require('popper.js/dist/umd/popper.min.js');

//Bootstrap
require('bootstrap');
import 'bootstrap/dist/css/bootstrap.min.css';

//Font-Awesome
import '@fortawesome/fontawesome-free/css/all.min.css';

//Angular, Angular Route, Angular Material, Angular Aria e Angular Messages
require('angular/angular.min.js');
require('angular-route/angular-route.min.js');
require('angular-material/angular-material.min.js');
import 'angular-material/angular-material.min.css';
require('angular-animate/angular-animate.min.js');
require('angular-aria/angular-aria.min.js');
require('angular-messages/angular-messages.min.js');

/**
 * @AngularJS App, Routes, Components, Controllers
 * */
require('./app/app.js');
require('./app.api.js');
require('./config/config.app.js');

/**
 * Components
 * */
require('./components/navbar/navbar.component.js');

/**
 * Controllers
 * */
require('./controllers/sidebar_controller.js');
require('./controllers/users/users_create_controller.js');
require('./controllers/users/users_edit_controller.js');
require('./controllers/users/users_list_controller.js');
require('./controllers/toasts_controller.js');
