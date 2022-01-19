function Card(props) {
    const {card, showInfo, id} = props;
    return(
        <div className="card" onClick={()=>showInfo(id)}>
            <h3>{card.name}</h3>
        </div>
    );
}
export default Card;