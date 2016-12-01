import path from 'path';

export default function routes($stateProvider, $translateProvider, $compileProvider, $httpProvider, $urlRouterProvider) {
	'ngInject';
	$compileProvider.debugInfoEnabled(true);

	$httpProvider.defaults.cache = true;

	$stateProvider
	.state('home', {
		url: '/home',
		views: {
			mainView: {
				component: 'home'
			},
			rightMenuView: {
				component: 'rightMenu'
			}
		}
	})

	.state('about', {
		url: '/about',
		views: {
			mainView: {
				component: 'about'
			}
		}
	})

	.state('page2', {
		url: '/page2',
		views: {
			mainView: {
				component: 'page2'
			},
			rightMenuView: {
				component: 'rightMenu'
			}
		}
	})

	.state('createRessource', {
		url: '/ressources/createRessource',
		views: {
			mainView: {
				component: 'createRessource'
			}
		}
	});

	$urlRouterProvider.otherwise('/home');

	let languages = ['en', 'fr'];

	// load languages from json files (when needed)
	$translateProvider.useStaticFilesLoader({
		prefix: path.join(__dirname, 'lib/languages/'),
		suffix: '.json'
	});

	// handle multiple locales for one language
	$translateProvider.registerAvailableLanguageKeys(languages, {
		'en_*': 'en',
		'fr_*': 'fr'
	});

	// define sanitize strategy and prefered language
	$translateProvider.useSanitizeValueStrategy('escape');
	$translateProvider.determinePreferredLanguage();
}
