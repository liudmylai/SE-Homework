function CardInfo(props) {
    const { info, closeInfo } = props;
    return (
        <div className='modal'>
            {info.map((field, index) =>
                <div key={index}>{field.key}: {field.value}</div>
            )}
            <button className="close" onClick={closeInfo}>Close</button>
        </div>
    );
}
export default CardInfo;