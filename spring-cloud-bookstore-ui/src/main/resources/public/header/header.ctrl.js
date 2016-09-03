/**
 * Created by Jiachi on 7/11/2016.
 */
(function () {
    "use strict";

    var headerController = ['$scope', '$http', function ($scope, $http) {
        $scope.logout = function () {
            $http.post('logout', {}).finally(function () {
                window.location.href = '/ui';
            });
        };
    }];

    angular.module('bookstoreApp').controller('HeaderController', headerController);
})();