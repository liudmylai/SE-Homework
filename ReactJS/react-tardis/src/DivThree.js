import { useContext, useState } from "react";
import { TardisContext } from './App';

function DivThree() {
    const context = useContext(TardisContext);

    const [info, setInfo] = useState(context)

    const changeIt = (text) => {
        if (info.tardis.caps) {
            setInfo({
                tardis: {
                    name: text.toLowerCase(),
                    caps: false
                }
            })
        } else {
            setInfo({
                tardis: {
                    name: text.toUpperCase(),
                    caps: true
                }
            })
        }
    }

    return (
        <div>
            <h3 onClick={() => changeIt(info.tardis.name)}>
                {info.tardis.name}
            </h3>
        </div>
    );
}

export default DivThree;