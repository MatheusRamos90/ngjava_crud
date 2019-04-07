/**
 * Created by: Matheus Ramos 07/04/2019 - https://matheusramos.com/
 * */

import app from '../../app/app.js';

app.component('appNavbar', {
    controller: function($http,$scope,$location,$timeout, $mdSidenav,$log) {

        $scope.toggleRight = buildToggler('left');
        $scope.isOpenSidebar = function(){
            return $mdSidenav('left').isOpen();
        };

        $scope.user = [
            {id: 1,name: 'Matheus Ramos', image: 'public/images/me_02.jpg'}
        ];

        function buildToggler(navID) {
            return function() {
                // Component lookup should always be available since we are not using `ng-if`
                $mdSidenav(navID)
                    .toggle()
                    .then(function () {
                        $log.debug("toggle " + navID + " is done");
                    });
            };
        }

        $scope.logout = function () {}

    },
    templateUrl: 'public/js/components/navbar/navbar.component.html'
});