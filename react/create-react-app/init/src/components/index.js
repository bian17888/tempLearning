import React from 'react';
import PropTypes from 'prop-types';

class Beck extends React.Component {
    constructor(props, context) {
        super(props, context);
        this.onClickBeck = this.onClickBeck.bind(this);
    }
    render() {
        const {dataSource} = this.props;
        return (
            <div>
                <button onClick={this.onClickBeck}> 123</button>
            </div>
        );
    }

    // //////////////////////////////////////////////////
    
    onClickBeck() {
        console.log(this.props.dataSource);
        alert(123);
        this.props.dataSource.hello = '22222'
        console.log(this.props.dataSource);
    }
}

Beck.propTypes = {

};
export default Beck;