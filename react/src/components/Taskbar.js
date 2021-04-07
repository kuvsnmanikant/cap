import React, { useState, useEffect } from 'react'
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'
import Form from 'react-bootstrap/Form'
import FormControl from 'react-bootstrap/FormControl'
import Button from 'react-bootstrap/Button'
import NavDropdown from 'react-bootstrap/NavDropdown'
import BootstrapSwitchButton from 'bootstrap-switch-button-react'
import logo0 from './images/formbg.png'
import logo1 from './images/Picture3.png'
import './cSs/images.css'
import { setTheam } from '../reduxfolder'
import { connect } from 'react-redux';
import { useSelector, useDispatch } from 'react-redux';

function Taskbar(props) {
   
    
    const [light, setLight] = useState('light')

    useEffect(() => {
        setLight(props.Dark ? "light" : "dark")
    
    });





    return (
        <>
            <Navbar collapseOnSelect expand="lg" bg={light} variant={light} sticky="top">
                <Navbar.Brand href="/"><img src={props.Dark ? `${logo0}` : `${logo1}`} className="a" title="Home" alt="logo" /></Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link href="features">Status</Nav.Link>
                        <Nav.Link href="pricing">Contact Info</Nav.Link>
                        <NavDropdown title="More Info" id="collasible-nav-dropdown">
                            <NavDropdown.Item href="table">Train Time Table</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.2">Directives</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.3">Holiday Packages</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <BootstrapSwitchButton onlabel='Dark Theam' offlabel='Light Theam' onstyle="dark" width="100" onChange={(checked) => { props.setisDark(checked) }} />

                        </NavDropdown>
                    </Nav>
                    <Nav>
                        <Nav.Link href="login">Log In</Nav.Link>
                        <Nav.Link eventKey={2} href="signin">Sign In</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Navbar>


            {/* <Navbar bg="dark" variant="dark" sticky="top">
    <Navbar.Brand href="#home">Navbar</Navbar.Brand>
    <Nav className="mr-auto">
      <Nav.Link href="#home">Home</Nav.Link>
      <Nav.Link href="#features">Features</Nav.Link>
      <Nav.Link href="#pricing">Pricing</Nav.Link>
    </Nav>
    
  </Navbar> */}
  
        </>
    )
}

const mapStateToProps = state => {
    return {
        t: state.theam.t
    }
}

const mapDispatchToProps = dispatch => {
    return {
        setTheam: (Dark) => dispatch(setTheam(Dark))
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(Taskbar)
