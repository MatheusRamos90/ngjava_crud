/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from '../../app/app.js';
import URL_API from '../../app.api.js';

app.controller('users_edit_controller', function ($http,$scope,$location,$interval,$rootScope,$routeParams) {

    $scope.form_edit = {
        name: '', email: '', gender: '', date_created: '', date_updated: ''
    };

    this.$onInit = function(){
        $http.get(URL_API + '/admin/users/' + $routeParams.id, { headers: {'Content-Type': 'application/json'} }).then(response => {
            $scope.form_edit = response.data;
        })
            .catch(error => { $rootScope.showToast("Ops! Os dados não podem ser mostrados.", "danger"); })
    };

    $scope.submitEditUser = function() {

        $http.put(URL_API + '/admin/users/' + $routeParams.id, this.form_edit,{ headers: {'Content-Type': 'application/json'} }).then(response => {
            if(response.data === true){
                $rootScope.showToast("Ok! Os dados foram inseridos corretamente.", "success");
            }
        }).catch(error => {
            $rootScope.showToast("Ops! Houve um erro interno.", "danger");
        })

    };

});