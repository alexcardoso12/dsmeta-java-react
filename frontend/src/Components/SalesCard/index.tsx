import NotificationButton from '../NotificationButton'
import './styles.css'
import DatePicker from "react-datepicker"
import "react-datepicker/dist/react-datepicker.css"
import { useState } from 'react'


function SalesCard() {

  const min = new Date(new Date().setDate(new Date().getDate()-365));
  const max = new Date();

  const [minDate, setMinDate] = useState(min);
  const [maxDate, setMaxDate] = useState(max);

  return (
    <div className="dsmeta-card">
      <h2 className="dsmeta-sales-title">VENDAS</h2>
      <div>
        <div className="dsmeta-form-control-container">
          <DatePicker
            selected={minDate}
            onChange={(date: Date) => setMinDate(date) }
            className="dsmeta-form-control"
            dateFormat="dd/MM/yyyy"
          />

        </div>
        <div className="dsmeta-form-control-container">
          <DatePicker
            selected={maxDate}
            onChange={(date: Date) => setMaxDate(date)}
            className="dsmeta-form-control"
            dateFormat="dd/MM/yyyy"
          />

        </div>
      </div>

      <div>
        <table className="dsmeta-vendas-table">
          <thead>
            <tr>
              <th className="show992">ID</th>
              <th className="show576">DATA</th>
              <th>VENDEDOR</th>
              <th className="show992">VISITAS</th>
              <th className="show992">VENDAS</th>
              <th>TOTAL</th>
              <th>NOTIFICAR</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="show992">#341</td>
              <td className="show576">08/09/2022</td>
              <td>AMANDA</td>
              <td className="show992">15</td>
              <td className="show992">11</td>
              <td>R$ 35300.00</td>
              <td>
                <div>
                  <NotificationButton />
                </div>
              </td>
            </tr>
            <tr>
              <td className="show992">#341</td>
              <td className="show576">08/09/2022</td>
              <td>CAIO</td>
              <td className="show992">15</td>
              <td className="show992">11</td>
              <td>R$ 60300.00</td>
              <td>
                <div>
                  <NotificationButton />
                </div>
              </td>
            </tr>
            <tr>
              <td className="show992">#341</td>
              <td className="show576">08/09/2022</td>
              <td>JULIANA</td>
              <td className="show992">15</td>
              <td className="show992">11</td>
              <td>R$ 58300.00</td>
              <td>
                <div>
                  <NotificationButton />
                </div>
              </td>
            </tr>
          </tbody>

        </table>

      </div>




    </div>
  )
}

export default SalesCard
