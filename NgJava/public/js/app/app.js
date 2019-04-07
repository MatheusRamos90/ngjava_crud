/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import URL_API from '../app.api';

/**
 * @App
 * */
export default angular.module('app', ['ngRoute', 'ngMaterial', 'ngMessages']).run(function ($http,$location,$rootScope,$mdToast) {

    /**
     * @GlobalFunctions
     * */
    //showToast() = show toast alert on view
    $rootScope.showToast = function(message, color) {
        $mdToast.show({
            hideDelay: 3000,
            position: 'bottom bottom',
            controller: 'toasts_controller',
            bindToController: true,
            locals: {toastMessage: message, toastAlert: color},
            templateUrl: 'public/js/components/toast/toast.component.html'
        })
    };

});