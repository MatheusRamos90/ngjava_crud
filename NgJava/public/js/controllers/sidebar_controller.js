/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from "../app/app";

app.controller('sidebar_controller', function ($scope) {

    $scope.list_sidebar = [
        { name: 'Dashboard', icon: 'dashboard', url: '/' },
        { name: 'Novo usuário', icon: 'person_add', url: 'users/create' },
        { name: 'Minha conta', icon: 'account_circle', url: 'account' },
        { name: 'Logs', icon: 'list_alt', url: 'logs' },
        { name: 'Sair', icon: 'exit_to_app', url: 'logout' }
    ];

});