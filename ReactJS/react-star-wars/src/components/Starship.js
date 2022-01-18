function Starship(props) {
    const {starship, showStarshipInfo, id} = props;
    return(
        <div className="card" onClick={()=>showStarshipInfo(id)}>
            <h3>{starship.name}</h3>
        </div>
    );
}
export default Starship;