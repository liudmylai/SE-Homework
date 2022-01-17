function Starship(props) {
    const {starship} = props;
    return(
        <div className="card">
            <h3>{starship.name}</h3>
        </div>
    );
}
export default Starship;