import React, { useState, useEffect } from 'react'
import axios from 'axios'
import Modal from 'react-bootstrap/Modal'
import Button from 'react-bootstrap/Button'
import Form from 'react-bootstrap/Form'
import './cSs/Login.css'

function Example() {
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);
    useEffect(() => {
        // Your code here
        handleShow()
    }, []);

    const [user_id, setUser_id] = useState("");
    const [password, setPassword] = useState("");

    // const login =() =>{
    //     axios.pos
    // }
    return (
        <>
            <Modal
                show={show}
                onHide={handleClose}
                backdrop="static"
                keyboard={false}
                
                centered
            >
                <Modal.Header closeButton className="aaaa">
                    <Modal.Title>LOG IN</Modal.Title>
                </Modal.Header>
                <Modal.Body className="aaaa" >
                    <Form className="form-container">
                        <Form.Group controlId="formBasicEmail">
                            <Form.Label>Email address</Form.Label>
                            <Form.Control type="email" placeholder="Enter email" />
                            <Form.Text className="text-muted">
                                We'll never share your email with anyone else.
                                     </Form.Text>
                        </Form.Group>

                        <Form.Group controlId="formBasicPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password" />
                        </Form.Group>
                        {/* <Form.Group controlId="formBasicCheckbox">
                                    <Form.Check type="checkbox" label="Check me out" />
                                </Form.Group> */}
                        <Button variant="primary btn-block" type="submit">
                            log in
                                </Button><br/>
                                <Button variant="outline-info">forgot password</Button>
                                <a href="signin"><Button variant="outline-info float-right" >sign up</Button></a>
                                
                    </Form>


                </Modal.Body>
                {/* <Modal.Footer className="aaaa">
                    <Button variant="secondary" onClick={handleClose}>
                        Close
            </Button>

                </Modal.Footer> */}
            </Modal>

        </>
    );
}

export default Example