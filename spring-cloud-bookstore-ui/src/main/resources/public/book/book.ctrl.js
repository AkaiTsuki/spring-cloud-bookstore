/**
 * Created by Jiachi on 7/11/2016.
 */
(function () {
    "use strict";

    var bookController = ['$scope', 'books', function ($scope, books) {
        $scope.books = books;
    }];

    angular.module('bookstoreApp').controller('BookController', bookController);
})();