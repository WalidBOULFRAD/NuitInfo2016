import HomeView from './home.html';
import HomeController from './home.controller.js';
import './home.scss';

class Home {
	static detailsComponent() {
		return {
			templateUrl: HomeView,
			controller: HomeController
		};
	}
}

export default Home.detailsComponent();
