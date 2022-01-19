function CardInfo(props) {
    const { info, closeInfo } = props;
    return (
        <div className='modal'>
            {info.map(field => (
                <div>{field.key}: {field.value}</div>
            ))}
            <button className="close" onClick={closeInfo}>Close</button>
        </div>
    );
}
export default CardInfo;