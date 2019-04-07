/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from '../../app/app.js';
import URL_API from '../../app.api.js';

app.controller('users_create_controller', function ($http,$scope,$location,$interval,$rootScope) {

    $scope.form_create = {
        name: '', email: '', gender: '', date_created: '', date_updated: ''
    };

    $scope.submitCreateUser = function() {

        $http.post(URL_API + '/admin/users', this.form_create, { headers: {'Content-Type': 'application/json'} }).then(response => {
            if(response.data === true){
                $rootScope.showToast("Ok! Os dados foram inseridos corretamente.", "success");
            }
        }).catch(error => {
            $rootScope.showToast("Ops! Houve um erro interno.", "danger");
        })

    };

});