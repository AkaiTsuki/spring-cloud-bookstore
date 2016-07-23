/**
 * Created by Jiachi on 7/11/2016.
 */
(function () {
    "use strict";

    var bookService = ['$http', '$q', function ($http, $q) {
        var me = this;

        me.loadAllBooks = function () {
            var deferred = $q.defer();

            $http.get("token").success(function(token){
                $http({
                    url: '/services/books',
                    method: 'GET',
                    headers: {
                        'X-Auth-Token' : token.token
                    }
                }).success(function (data) {
                    deferred.resolve(data);
                });
            });

            return deferred.promise;
        };
    }];

    angular.module('bookstoreApp').service('BookService', bookService);
})();