class HomeController {
	constructor($state) {
		'ngInject';
		this.$state = $state;
	}

	goToMap() {
		console.log('coucou');
		this.$state.go('map');
	}
}

export default HomeController;
