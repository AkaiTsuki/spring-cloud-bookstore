/**
 * Created by Jiachi on 7/11/2016.
 */

(function(){
    angular.module('bookstoreApp', ['ui.router'])
        .config(function($stateProvider, $urlRouterProvider){
            $urlRouterProvider.otherwise("/home");

            $stateProvider.state('home', {
                url: '/home',
                views: {
                    'main@': {
                        templateUrl: 'ui/book/book.list.html',
                        controller: 'BookController'
                    },
                    'header@': {
                        templateUrl: 'ui/header/header.html',
                        controller: 'HeaderController'
                    }
                },
                resolve: {
                    books: function (BookService) {
                        return BookService.loadAllBooks();
                    }
                }
            })
        });
})();