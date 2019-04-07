/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from '../../app/app.js';
import URL_API from '../../app.api.js';

app.controller('users_list_controller', function ($http,$scope,$location,$interval,$rootScope) {

    $scope.list_users = [];

    this.$onInit = function () {
        $http.get(URL_API + '/admin/users', { headers: {'Content-Type': 'application/json'} }).then(response => {
            $scope.list_users = response.data;
        });
    };

    $scope.formatDate = function(date) {
        var dateOut = new Date(date);
        return dateOut;
    };

    $scope.edit_ = function (key) {
        $location.path(`/users/edit/${key}`);
    };

    $scope.remove_ = function (user, key) {

        var remove = confirm('Deseja realmente remover este dado?');
        if(remove){
            $http.delete(URL_API + '/admin/users/' + key, { headers: {'Content-Type': 'application/json'} }).then(response => {
                if(response.data === true){
                    $scope.list_users.splice($scope.list_users.indexOf(user), 1);
                    $rootScope.showToast("Ok! Dado removido com sucesso.", "success");
                }
            })
                .catch(error => {
                    $rootScope.showToast("Ops! Houve um erro interno.", "danger");
                });
        }
    };

});