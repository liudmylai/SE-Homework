import { NavLink } from "react-router-dom";

function Nav() {
    return(
        <nav>
            <ul>
                <NavLink to='starships'>
                    <li>Starships</li>
                </NavLink>
                <NavLink to='people'>
                    <li>People</li>
                </NavLink>
                <NavLink to='planets'>
                    <li>Planets</li>
                </NavLink>
            </ul>
        </nav>
    );
}
export default Nav;