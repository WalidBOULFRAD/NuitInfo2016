import AboutView from './about.html';
import './about.scss';

class About {
	static detailsComponent() {
		return {
			templateUrl: AboutView
		};
	}
}

export default About.detailsComponent();
