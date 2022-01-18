function StarshipInfo(props) {
    const {info, closeStarshipInfo} = props;
    return (
        <div className='modal'>
            <div>Model: {info.model}</div>
            <div>Manufacturer: {info.manufacturer}</div>
            <div>Cost in credits: {info.cost_in_credits}</div>
            <div>Length: {info.length}</div>
            <div>Max atmosphering speed: {info.max_atmosphering_speed}</div>
            <div>Crew: {info.crew}</div>
            <div>Passengers: {info.passengers}</div>
            <div>Cargo capacity: {info.cargo_capacity}</div>
            <div>Consumables: {info.consumables}</div>
            <div>Hyperdrive rating: {info.hyperdrive_rating}</div>
            <div>MGLT: {info.MGLT}</div>
            <div>Starship class: {info.starship_class}</div>
            <button className="close" onClick={closeStarshipInfo}>Close</button>
        </div>
    );
}
export default StarshipInfo;