/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from '../app/app.js';

/**
 * @Config Routes configurations and Others
 * *
 */
app.config(function ($routeProvider, $locationProvider, $mdIconProvider) {
    $routeProvider.
    when('/', { controller: 'users_list_controller', templateUrl: 'templates/users/list.html' }).
    when('/users', { controller: 'users_list_controller', templateUrl: 'templates/users/list.html' }).
    when('/users/create', { controller: 'users_create_controller', templateUrl: 'templates/users/create.html' }).
    when('/users/edit/:id', { controller: 'users_edit_controller', templateUrl: 'templates/users/edit.html' }).
    when('/users/edit', { controller: 'users_list_controller', templateUrl: 'templates/users/list.html' }).
    otherwise({redirectTo: '/'});

    // use the HTML5 History API
    $locationProvider.html5Mode(true);

    //Global Use Material Icons
    $mdIconProvider.fontSet('md', 'material-icons');

});
