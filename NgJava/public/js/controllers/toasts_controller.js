/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from '../app/app.js';

app.controller('toasts_controller', function($scope, $mdToast, $mdDialog, toastMessage, toastAlert) {
    $scope.toast = toastMessage;
    switch (toastAlert){
        case "danger":
            $scope.toast_alert = 'md-alert-danger';
            break;
        case "warning":
            $scope.toast_alert = 'md-alert-warning';
            break;
        case "success":
            $scope.toast_alert = 'md-alert-success';
            break;
        default:
            $scope.toast_alert = 'md-alert-info';
    }
});