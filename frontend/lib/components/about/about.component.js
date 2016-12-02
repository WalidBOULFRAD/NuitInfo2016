import AboutView from './about.html';
import AboutController from './about.controller.js';
import './about.scss';

class About {
	static detailsComponent() {
		return {
			templateUrl: AboutView,
			controller: AboutController
		};
	}
}

export default About.detailsComponent();
